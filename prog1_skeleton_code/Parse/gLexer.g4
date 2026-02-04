
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
 * Token: WS(White space)
 *
 * Type: MISC
 *
 * Notes:
 *   Skip any and all white space, new line, or tab between tokens 
 *   uses build in feature to skip any occurences of WS when parsing 
 */
WS: [ \t\n]+ -> skip; 

/**
 * Token: COMMENT
 *
 * Type: MISC
 *
 * Notes:
 *   Single line comment which will negate anything after // until EOL  
 */
COMMENT: '//' ~[\r\n]* -> skip; 


/**
 * Token: KEYWORDS
 *
 * Type: Identifier
 *
 * Notes:
 *  reserved for keywords like if and var which cannot be identifiers
 */
 VAR : 'var';
 FUN : 'fun';
 WHILE : 'while';
 CONST : 'const';
 STRING : 'string';
 VOID : 'void';
 RETURN : 'return';
 IF : 'if';
 ELSE : 'else';
 BREAK : 'break';
 INT : 'int';
 TYPEDEF : 'typedef';
 STRUCT : 'struct';
 UNION : 'union';

 ENUM: 'enum';

/**
 * Token: PUNCTUATION & OPERATION
 *
 * Type: brackets, punctuation, opeerators
 *
 * Notes:
 *  language specific operators and punctuations
 */


UNDERSCORE: '_';

L_BRACKET: '[';
R_BRACKET: ']';
L_PARENTHESIS: '(';
R_PARENTHESIS: ')';
L_CURLY: '{';
R_CURLY: '}';

COLON: ':';
PERIOD: '.';
COMMA: ',';
SEMICOLON: ';';

LESS: '<';

ARROW_POINTER: '->';
STAR_POINTER_OR_MULTIPLICATION: '*';

LOGICAL_NOT_OR_EXCLAMATION: '!';
LOGICAL_AND: '&&';
LOGICAL_OR: '||'
BITWISE_AND_OR_ADDRESS_OF: '&';
BITWISE_OR: '|';
BITWISE_NOT_OR_TILDE: '~'; 

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


/**
 * Token: Assign
 *
 * Type: Operator
 *
 * Notes:
 */
ASSIGN: '=';



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
 *   Since KEYWORD is declared above, antlr takes priority of that so Identifier cannot be a keywrod. Cant have a variable named 'if'
 *   Case sensitive so var and VAR are distinct 
 */
ID
   : (ALPHA | '_')(ALPHA | '_' | DIGIT)*;




