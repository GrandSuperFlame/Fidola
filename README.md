# Fidola
Fidola

@ Founding 31.12.2020

This is a new programming language.
The main goal is for it to be highly safe and performant.
Development should be easy and fast for high and low level applications.

It is compiled. Maybe with an additional scripting option.

Planned features:

- Static and compiled
- Deep integration with an ide
- automatic memory management by compiler analysis
- exceptions exist but each function advertises if it can throw. compiler infered
- different rules for libraries.
- code generation commands
- hot code update
- Binary files, not text files for code
- Big use of colors in ide to signal informations that are useful in development
- a library is its onw specific unit and not just a package
- no inheritance, just interfaces
- pure functions can be marked as such
- contracts: as in conditions for arguments of functions: these are then staticaly proven always. if conditions are not fulfilled, it is a compile error
- no division by zero, and no integer overflow: whenever such arithmetic operations are done, compiler tests staticaly if it could maybe happen. if yes then error
- default is null safe
- any size generics like: touple<T...> adn then one can make one: touple<int,int,string,string>
- no LLVM backend
- options for each project and compiler
- possibility to include libraries of different versions
- modules as specific unit (similar to a class, but can have moduel wide globals, can't be used in libraries)
- compiler hints for bad code and issues (like if an interface is only implemented once)
- types that implement many interfaces get a strict seperation between the inteface methods so there can not be any conflict
- no recursion allowed (cyclic function calls are fine)  (recursion is easy to do, but is jsut not needed. use loops instead)
- a store for libraries, code generation commands, and templates
- support for a plug in system for running software. like a virtual maschine.
