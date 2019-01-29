program fizzbuzz

   implicit none

   integer :: n               !maximum integer number from user input
   integer :: i = 0           !loop iterator
   character*8 :: stringout   !output string on each iteration

   !get integer up to which FizzBuzz will go
   print *, "Please enter a number up to which FizzBuzz shall be played:  "
   read *, n
   print *, "You chose:  ", n

   !print each number appropriately
   do i=1, n
      stringout = ""
      if (mod(i, 3) == 0) then
         stringout = trim(stringout) // "Fizz"
      endif
      if (mod(i, 5) == 0) then
         stringout = trim(stringout) // "Buzz"
      endif
      if (stringout == "") then
         write (stringout, "(1i4)") i
      endif

      print *, stringout
   
   end do
   

end program fizzbuzz
