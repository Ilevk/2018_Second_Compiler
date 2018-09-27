grammar MiniGo;
program		: decl+	{System.out.println("201504278 Rule 0 program");};
decl		: var_decl {System.out.println("201504278 Rule 1-0 var_decl");}
			| fun_decl {System.out.println("201504278 Rule 1-1 fun_decl");};
var_decl	: dec_spec IDENT type_spec  {System.out.println("201504278 Rule 2-0 dec_spec IDENT type_spec");}
			| dec_spec IDENT type_spec '=' LITERAL  {System.out.println("201504278 Rule 2-1 dec_spec IDENT type_spec '=' LITERAL");}
			| dec_spec IDENT '[' LITERAL ']' type_spec {System.out.println("201504278 Rule 2-2 dec_spec IDENT '[' LITERAL ']' type_spec");};
dec_spec	: VAR {System.out.println("201504278 Rule 3 VAR");};
type_spec	: INT {System.out.println("201504278 Rule 4-0 INT");}
			| {System.out.println("201504278 Rule 4-1 e");};
fun_decl	: FUNC IDENT '(' params ')' type_spec compound_stmt {System.out.println("201504278 Rule 5-0 FUNC IDENT '(' params ')' type_spec compound_stmt");}
			| FUNC IDENT '(' params ')' '(' type_spec ',' type_spec ')' compound_stmt {System.out.println("201504278 Rule 5-1 FUNC IDENT '(' params ')' '(' type_spec ',' type_spec ')' compound_stmt");};
params		: param(',' param)* {System.out.println("201504278 Rule 6-0 param(',' param)*");}
			| {System.out.println("201504278 Rule 6-1 e");};
param		: IDENT {System.out.println("201504278 Rule 7-0 IDENT");}
			| IDENT type_spec	{System.out.println("201504278 Rule 7-1 IDENT type_spec");};
stmt		: expr_stmt {System.out.println("201504278 Rule 8-0 expr_stmt");}
			| compound_stmt {System.out.println("201504278 Rule 8-1 compound_stmt");}
			| if_stmt {System.out.println("201504278 Rule 8-2 if_stmt");}
			| for_stmt {System.out.println("201504278 Rule 8-3 for_stmt");}
			| return_stmt {System.out.println("201504278 Rule 8-4 return_stmt");};
expr_stmt	: expr	{System.out.println("201504278 Rule 9 expr");};
for_stmt	: FOR loop_expr stmt	{System.out.println("201504278 Rule 10-0 FOR loop_expr stmt");}
			| FOR expr stmt	{System.out.println("201504278 Rule 10-1 FOR expr stmt");};
compound_stmt: '{' local_decl* stmt* '}' {System.out.println("201504278 Rule 11 '{' local_decl* stmt* '}'");};
local_decl	: dec_spec IDENT type_spec  {System.out.println("201504278 Rule 12-0 dec_spec IDENT type_spec");}
			| dec_spec IDENT type_spec '=' LITERAL  {System.out.println("201504278 Rule 12-1 dec_spec IDENT type_spec '=' LITERAL");}
			| dec_spec IDENT '[' LITERAL ']' type_spec {System.out.println("201504278 Rule 12-2 dec_spec IDENT '[' LITERAL ']' type_spec");};
if_stmt		: IF expr stmt {System.out.println("201504278 Rule 13-0 IF expr stmt");}
			| IF expr stmt ELSE stmt {System.out.println("201504278 Rule 13-1 IF expr stmt ELSE stmt");};
return_stmt	: RETURN expr{System.out.println("201504278 Rule 14-0 RETURN expr");}
			| RETURN expr ',' expr {System.out.println("201504278 Rule 14-1 RETURN expr ',' expr");}
			| RETURN {System.out.println("201504278 Rule 14-2 RETURN");};
loop_expr   : expr ';' expr ';' expr ('++'|'--') {System.out.println("201504278 Rule 15 expr ';' expr ';' expr ('++'|'--')");};
expr		: (LITERAL|IDENT) {System.out.println("201504278 Rule 16-0 (LITERAL|IDENT)");}
			| '(' expr ')' {System.out.println("201504278 Rule 16-1 '(' expr ')'");}
			| IDENT '[' expr ']' {System.out.println("201504278 Rule 16-2 IDENT '[' expr ']'");}
			| IDENT '(' args ')' {System.out.println("201504278 Rule 16-3 IDENT '(' args ')'");}
			| FMT '.' IDENT '(' args ')' {System.out.println("201504278 Rule 16-4 FMT '.' IDENT '(' args ')'");}
			| op=('-'|'+'|'--'|'++'|'!') expr {System.out.println("201504278 Rule 16-5 op=('-'|'+'|'--'|'++'|'!') expr");}
			| left=expr op=('*'|'/') right=expr {System.out.println("201504278 Rule 16-6 left=expr op=('*'|'/') right=expr");}
			| left=expr op=('%'|'+'|'-') right=expr {System.out.println("201504278 Rule 16-7 left=expr op=('%'|'+'|'-') right=expr");}
			| left=expr op=(EQ|NE|LE|'<'|GE|'>'|AND|OR) right=expr {System.out.println("201504278 Rule 16-8 left=expr op=(EQ|NE|LE|'<'|GE|'>'|AND|OR) right=expr");}
			| IDENT '=' expr {System.out.println("201504278 Rule 16-9 IDENT '=' expr");}
			| IDENT '[' expr ']' '=' expr {System.out.println("201504278 Rule 16-10 IDENT '[' expr ']' '=' expr");};
args		: expr (',' expr) * {System.out.println("201504278 Rule 17-0 expr (',' expr) * ");}
			| {System.out.println("201504278 Rule 17-1 e");};
VAR			: 'var'   {System.out.println("201504278 Rule 18 'var'");};
FUNC		: 'func'  {System.out.println("201504278 Rule 19 'func'");};
FMT			: 'fmt'	  {System.out.println("201504278 Rule 20 'fmt'");};
INT			: 'int'   {System.out.println("201504278 Rule 21 'int'");};
FOR			: 'for'   {System.out.println("201504278 Rule 22 'for'");};
IF			: 'if'    {System.out.println("201504278 Rule 23 'if'");};
ELSE		: 'else'  {System.out.println("201504278 Rule 24 'else'");};
RETURN		: 'return'{System.out.println("201504278 Rule 25 'return'");};
OR			: 'or'    {System.out.println("201504278 Rule 26 'or'");};
AND			: 'and'   {System.out.println("201504278 Rule 27 'and'");};
LE			: '<='    {System.out.println("201504278 Rule 28 '<='");};
GE			: '>='    {System.out.println("201504278 Rule 29 '>='");};
EQ			: '=='    {System.out.println("201504278 Rule 30 '=='");};
NE			: '!='    {System.out.println("201504278 Rule 31 '!='");};

IDENT		: [a-zA-Z_] {System.out.println("201504278 Rule 32-0 [a-zA-Z_]");}
			( [a-zA-Z_] {System.out.println("201504278 Rule 32-1 ([a-zA-Z])");}
			| [0-9] {System.out.println("201504278 Rule 32-2 ([0-9])");}
			)* {System.out.println("201504278 Rule 32-3 ([a-zA-Z]|[0-9])*");};
			
LITERAL		: DecimalConstant | OctalConstant | HexadecimalConstant {System.out.println("201504278 Rule 33 Decimal,Octal,Hexaldecimal LITERAL");};

DecimalConstant	: '0' | [1-9] [0-9]* {System.out.println("201504278 Rule 34 Decimal");};
OctalConstant	: '0' [0-7]* {System.out.println("201504278 Rule 35 Ocatal");};
HexadecimalConstant	: '0' [xX] [0-9a-fA-F]+ {System.out.println("201504278 Rule 36 Hexadecimal");};
WS			: (' ' {System.out.println("201504278 Rule 37-0 space");}
			| '\t' {System.out.println("201504278 Rule 37-1 tab");}
			| '\r' {System.out.println("201504278 Rule 37-2 return");}
			| '\n' {System.out.println("201504278 Rule 37-3 carriage return");}
			)+ {System.out.println("201504278 Rule 37-4 WS");}
	-> channel(HIDDEN)
    ;
