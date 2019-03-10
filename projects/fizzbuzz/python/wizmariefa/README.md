# Fizz Buzz
Developed on a Mac.

## Running the Program
To run this program, open your terminal of choice, and:
1. Clone the project and check out a new branch:
```
git clone git@github.com:wizmariefa/methods.git
git checkout -b "my-new-branch"
```
**NOTE**: If you are running this program on windows, SSH is not installed natively. 
You can clone the repo using the command: 
```
git clone https://github.com/wizmariefa/methods.git
```

2. Navigate to the `projects/python/wizmariefa` directory.
3. Run the following command in the `projects/python/wizmariefa` directory:
```
python3 fizzbuzz.py
```
4. The program will prompt you for a positive integer with the phrase:
```
Enter your 'fizzbuzz number > 
```
5. Enter your positive integer of choice when prompted.

## Testing
1. This test suite uses the pytest module. To install, run the following command:
```
pip3 install pytest pytest-cov
```
2. navigate to the directory `projects/fizzbuzz/python/wizmariefa`. Then, run the following command to run the unit tests:
```
pytest --cov=. fizzbuzz_test.py
```
If you are not in the correct directory, this command __will not work__. You should see output following the testing of the two functions defined in `fizzbuzzbazz.py`.