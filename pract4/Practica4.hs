

module Practica4 where

	import Data.Char (ord)
	import Data.List

	numCbetw2 :: (Char, Char) -> Int
	
	-- Exercice 1 function

	numCbetw2 (a,b)
		   | a == b  = 0
		   | ord a > ord b = ((ord a) - (ord b)) -1 
           | otherwise = ((ord b) - (ord a)) -1 

	-- Exercice 1 function

	


	-- Exercice 3 function

	max' a b
		   | a > b  = a
		   | b > a = b 
           | otherwise = a 

    -- Exercice 4 function
	
	leapyear a
		   | (mod a 100) == 0 && (mod a 400) /= 0 = False
		   | (mod a 100) == 0 && (mod a 400) == 0 = False
    	   | mod a 4 == 0 = True   	   		   
           | otherwise = False

    -- Exercice 5 function
    

	daysAmonth m y
    	   | (isMember m  [1,3,5,7,8,10,12]) == True = 31
    	   | (isMember m [4,6,9,11]) == True = 30




    