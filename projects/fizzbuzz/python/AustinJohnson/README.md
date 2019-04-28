#FizzBuzz

## Instructions
1. To run my program, make sure you have the latest version of python installed.
2. Save this python file on your local machine make sure it's named "fizzbuzz.py".
3. Open **Terminal for mac users** or **Command Line for windows users**.
4. Navigate to the directory you saved the file and enter:
```
python fizzbuzz.py
```
5. When the program starts you will be prompted to enter a positive integer.
6. To quit, simply input 0.

## Testing
1. For our testing method I have created test cases in pytest, this must be installed.
2. To do so, assuming a OSX machine is being used simply type this into the terminal:
```
pip3 install pytest pytest-cov
```
3. After installed, you now need to run this on our fizzbuzz.py file.
4. To do so, simply type this into terminal (Make sure you are in the same directory as fizzbuzz.py):
```
pytest --cov=. fizzbuzztest.py
```
