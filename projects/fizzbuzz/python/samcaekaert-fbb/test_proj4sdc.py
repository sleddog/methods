import unittest
import proj4sdc

class TestCalc(unittest.TestCase):
    
    def test_base(self):
        self.assertEqual(proj4sdc.fizzbuzz(1),1)
        self.assertEqual(proj4sdc.fizzbuzz(2),2)
        self.assertEqual(proj4sdc.fizzbuzz(4),4)
        self.assertEqual(proj4sdc.fizzbuzz(499),499)

    def test_3(self):
        self.assertEqual(proj4sdc.fizzbuzz(3), 'fizz')
        self.assertEqual(proj4sdc.fizzbuzz(6), 'fizz')
        self.assertEqual(proj4sdc.fizzbuzz(333), 'fizz')
        
    def test_5(self):
        self.assertEqual(proj4sdc.fizzbuzz(5), 'buzz')
        self.assertEqual(proj4sdc.fizzbuzz(10), 'buzz')
        self.assertEqual(proj4sdc.fizzbuzz(500), 'buzz')
        
    def test_27(self):
        self.assertEqual(proj4sdc.fizzbuzz(7), 'bazz')
        self.assertEqual(proj4sdc.fizzbuzz(77), 'bazz')
        self.assertEqual(proj4sdc.fizzbuzz(497), 'bazz')
        
    def test_35(self):
        self.assertEqual(proj4sdc.fizzbuzz(15), 'fizzbuzz')
        self.assertEqual(proj4sdc.fizzbuzz(150), 'fizzbuzz')
        
    def test_37(self):
        self.assertEqual(proj4sdc.fizzbuzz(21), 'fizzbazz')
        self.assertEqual(proj4sdc.fizzbuzz(189), 'fizzbazz')
        
    def test_57(self):
        self.assertEqual(proj4sdc.fizzbuzz(35), 'buzzbazz')
        self.assertEqual(proj4sdc.fizzbuzz(490), 'buzzbazz')
        
    def test_357(self):
        self.assertEqual(proj4sdc.fizzbuzz(105), 'fizzbuzzbazz')
        self.assertEqual(proj4sdc.fizzbuzz(315), 'fizzbuzzbazz')
    
if __name__ == '__main__':
    unittest.main()