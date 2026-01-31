
lexer grammar gLexer;

@header {
   package Parse.antlr_build;
}


@members {
   StringBuilder sb;
   private int stringToInt(String target) {
      // TODO: Implement me!
      return 0;
   }
}

/* Tokens (all caps) */

/**
 * Fragment: ALPHA
 *
 * Description:
 *   Matches a single alphabetic character.
 *
 * Notes:
 *   helper for identifiers and keywords.
 */
fragment ALPHA
   : [A-Za-z]
   ;

 
/**
 * Fragment: DIGIT
 *
 * Description:
 *   Matches a single digit.
 *
 * Notes:
 *   helper for identifiers.
 */
fragment DIGIT
   : [0-9]
   ;

/**
 * Token: ID
 *
 * Type: Identifier
 *
 * Notes:
 *   Used to name variables, functions, types, and fields.
 *   Keyword tokens take priority. Cant have a variable named 'if'
 *   Case sensitive so var and VAR are distinct 
 */
ID
   : (ALPHA | '_')(ALPHA | '_' | DIGIT)*



/**
 * Token: ADD
 *
 * Type: Operator
 *
 * Notes:
 *   Left-associative; precedence handled by parser grammar.
 */
ADD 
   : '+'
   ;
