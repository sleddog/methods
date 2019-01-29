# fizzbuzz-fortran
This program is a Fortran solution to the FizzBuzz problem.

## Operation instructions
Upon starting the program, you will be prompted to enter an integer number.  After typing the number, press enter.  The program will then repeat your choice and output a line for each integer from 1 to _n_ inclusive, where _n_ is your input number.

Lines will read "Fizz" if the correpsonding number is divisible by 3, "Buzz" if divisible by 5, "FizzBuzz" if divisible by both 3 and 5, and the original number if none of these cases are true.

## Build instructions
In order to build this program, first download [GNU Fortran](https://gcc.gnu.org/fortran/).  GNU Fortran is an open-source Fortran compiler that is part of the GNU Compiler Collection (GCC).  GNU Fortran binaries can be installed from the relevant [GCC Wiki page](https://gcc.gnu.org/wiki/GFortranBinaries), or on Linux systems with APT as its package manager, it can be installed using the following command:

`sudo apt-get install gfortran`

Once installed, open a terminal in the folder containing `fizzbuzz.f90` and use the command `gfortran fizzbuzz.f90` to compile the program.  By default, the executable should be produced in the same folder and be called `a.out`.  On Linux systems, you can use the command `./a.out` to run the program.
