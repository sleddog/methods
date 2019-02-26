#!/bin/sh

echo 'Setting up Criterion for Unit testing...'
echo 'Cloning the reopsitory'
git clone --recursive https://github.com/Snaipe/Criterion

cd Criterion

echo 'Making build directory'
mkdir build

cd build

echo 'Compiling Criterion...'
cmake ..
cmake --build .

echo 'Installing make...'
sudo make install
