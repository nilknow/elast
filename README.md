# elast
this is a compiler for c like grammar files

## things to know
1. what's an executable file on Linux? 
   1.1 `file file_path`
   1.2 ELF file 
      1.2.1 file description + machine code
   
2. steps in `gcc` run
   2.1 preprocessor
      2.1.1 `#include + #define`
   2.2 compile
      2.2.1 assemble language code
   2.3 assemble
      2.3.1 `*.o` file
   2.4 link
   
3. steps in compile
   3.1 lexical analyze / scan
   3.2 syntax analyze / parse -> syntax tree 
   3.3 semantic analysis -> AST -> intermediate representation
   3.4 these steps above are front-end of compile
   3.5 code generation

## reference

* 自制编译器（图灵出版社）