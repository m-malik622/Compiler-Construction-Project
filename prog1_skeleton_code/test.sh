#!/bin/bash

# --- Setup ---
export CLASSPATH=$CLASSPATH:$(pwd)
export CLASSPATH=$CLASSPATH:$(pwd)/.solution/
export CLASSPATH=$CLASSPATH:$(pwd)/bin/
export CLASSPATH=$CLASSPATH:$(pwd)/lib/*

# Initialize Counters
testfiles=($(find ./tests/ -type f | sort)) # Added sort for consistency
total_tests=${#testfiles[@]}
current_test=0
passed_count=0

# Clear/Create Report Files
echo "################################################################################" > report.txt
echo "################################################################################" > solution_report.txt
echo "Test Run Report - $(date)" > final_report.txt
echo "--------------------------------------------------------------------------------" >> final_report.txt

echo "Starting Test Runner..."
echo "Total Tests to Run: $total_tests"
echo "--------------------------------------------------"

# --- The Main Loop ---
for testfile in "${testfiles[@]}"; do
    ((current_test++))
    
    # 1. Formatting for the log files
    header="################################################################################"
    {
        echo "$header"
        cat "$testfile"
        echo -e "\n\n$testfile" 
    } | tee -a report.txt >> solution_report.txt

    # 2. Run YOUR Implementation (Capture to temp file)
    ./run.sh "$testfile" > user_output.tmp 2>&1
    
    # 3. Run SOLUTION Implementation (Capture to temp file)
    ./run_solution.sh "$testfile" > solution_output.tmp 2>&1

    # 4. Compare outputs to check for Pass/Fail
    # We use 'diff -q' for a quiet check. If exit code is 0, they match.
    if diff -q user_output.tmp solution_output.tmp > /dev/null; then
        echo -e "[${current_test}/${total_tests}] ${testfile} ... \033[0;32mPASS\033[0m"
        ((passed_count++))
    else
        echo -e "[${current_test}/${total_tests}] ${testfile} ... \033[0;31mFAIL\033[0m"
        # Optional: Add the specific diff to the final report immediately
        echo "FAIL: $testfile" >> final_report.txt
        diff -u user_output.tmp solution_output.tmp >> final_report.txt
        echo "--------------------------------------------------" >> final_report.txt
    fi

    # 5. Append temp outputs to the main report files (to preserve your original logging)
    cat user_output.tmp >> report.txt
    cat solution_output.tmp >> solution_report.txt

done

# --- Clean up temp files ---
rm user_output.tmp solution_output.tmp

# --- Calculate Percentage ---
if [ "$total_tests" -gt 0 ]; then
    percentage=$(( 100 * passed_count / total_tests ))
else
    percentage=0
fi

# --- Final Summary ---
echo "--------------------------------------------------"
echo "SUMMARY:"
echo "Tests Passed: $passed_count / $total_tests"
echo "Pass Rate:    $percentage%"
echo "--------------------------------------------------"

# Add summary to final report file too
echo "" >> final_report.txt
echo "SUMMARY: $passed_count / $total_tests passed ($percentage%)" >> final_report.txt

echo "Detailed logs saved to: report.txt (Yours) and solution_report.txt (Expected)"
echo "Diffs of failures saved to: final_report.txt"