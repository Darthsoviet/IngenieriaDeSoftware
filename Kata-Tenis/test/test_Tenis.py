import unittest
import sys
sys.path.insert(0,"./src")
from Tenis import Tenis
from Jugador import Jugador

class test_Tenis(unittest.TestCase):


    def test_jugador1_puntos(self):
        jugador1=Jugador()
        jugador2=Jugador()

        tenis=Tenis(jugador1,jugador2)
        tenis.p1ganaPunto()
        tenis.p1ganaPunto()
        self.assertEquals(2,jugador1.getPuntaje(),jugador1.getPuntaje())

    def test_deuce(self):
        jugador1=Jugador()
        jugador2=Jugador()

        tenis=Tenis(jugador1,jugador2)

        tenis.p1ganaPunto()
        tenis.p1ganaPunto()
        tenis.p1ganaPunto()
        
        tenis.p2ganaPunto()
        tenis.p2ganaPunto()
        tenis.p2ganaPunto()
       
        
        self.assertEquals(3,jugador1.getPuntaje())
        self.assertEquals(3,jugador2.getPuntaje())

        self.assertTrue(tenis.isDeuce())

    def test_notVentaja(self):
        jugador1=Jugador()
        jugador2=Jugador()

        tenis=Tenis(jugador1,jugador2)

        tenis.p1ganaPunto()
        tenis.p1ganaPunto()
        tenis.p1ganaPunto()

        tenis.p2ganaPunto()
        tenis.p2ganaPunto()
        tenis.p2ganaPunto()
       
        
        self.assertFalse(tenis.isVentaja())
        
    def test_not_deuce(self):

        jugador1=Jugador()
        jugador2=Jugador()

        tenis=Tenis(jugador1,jugador2)

        tenis.p1ganaPunto()
        tenis.p2ganaPunto()

        self.assertEquals(1,jugador1.getPuntaje())
        self.assertEquals(1,jugador2.getPuntaje())
        self.assertFalse(tenis.isDeuce())

    def test_not_deuce2(self):

        jugador1=Jugador()
        
        jugador2=Jugador()
       

        tenis=Tenis(jugador1,jugador2)

        tenis.p1ganaPunto()
        tenis.p1ganaPunto()
        tenis.p1ganaPunto()
        tenis.p1ganaPunto()

        tenis.p2ganaPunto()

        self.assertEquals(4,jugador1.getPuntaje())
        self.assertEquals(1,jugador2.getPuntaje())
        self.assertFalse(tenis.isDeuce())
    

    def test_isVentaja(self):
        jugador1=Jugador()
        jugador2=Jugador()
      
        tenis=Tenis(jugador1,jugador2)

        tenis.p1ganaPunto()
        tenis.p1ganaPunto()
        tenis.p1ganaPunto()
        tenis.p1ganaPunto()
        
        tenis.p2ganaPunto()
        tenis.p2ganaPunto()
        tenis.p2ganaPunto()

        self.assertEquals(4,jugador1.getPuntaje())

        self.assertEquals(3,jugador2.getPuntaje())

        self.assertFalse(tenis.isDeuce())

        self.assertTrue(tenis.isVentaja())

        self.assertEqual(jugador1,tenis.getVentaja())

    def test_isGanador1(self):
        jugador1=Jugador()
        jugador2=Jugador()
      
        tenis=Tenis(jugador1,jugador2)

        tenis.p1ganaPunto()
        tenis.p1ganaPunto()
        tenis.p1ganaPunto()
        tenis.p1ganaPunto()
        tenis.p1ganaPunto()
        
        tenis.p2ganaPunto()
        tenis.p2ganaPunto()
        tenis.p2ganaPunto()

        self.assertEquals(5,jugador1.getPuntaje())
        self.assertEquals(3,jugador2.getPuntaje())
        
        self.assertEqual(jugador1,tenis.getGanador())


    def test_perder_puntos(self):
        jugador1=Jugador()
        jugador2=Jugador()
    
        tenis=Tenis(jugador1,jugador2)

        tenis.p1ganaPunto()
        tenis.p1ganaPunto()
        tenis.p1ganaPunto()
        tenis.p1ganaPunto()

        
            
        tenis.p2ganaPunto()
        tenis.p2ganaPunto()
        tenis.p2ganaPunto()
        self.assertEqual(tenis.getVentaja(), jugador1)
        tenis.p2ganaPunto()
        self.assertEqual(tenis.getVentaja(), jugador2)

        

        self.assertEquals(3,jugador1.getPuntaje())
        self.assertEquals(4,jugador2.getPuntaje())

    def test_isGanador2(self):
        jugador1=Jugador()
        jugador2=Jugador()
    
        tenis=Tenis(jugador1,jugador2)

        tenis.p1ganaPunto()
        tenis.p1ganaPunto()
        tenis.p1ganaPunto()
        
            
        tenis.p2ganaPunto()
        tenis.p2ganaPunto()
        tenis.p2ganaPunto()
        tenis.p2ganaPunto()
        tenis.p2ganaPunto()

        self.assertEquals(3,jugador1.getPuntaje())
        self.assertEquals(5,jugador2.getPuntaje())
            
        self.assertEqual(jugador2,tenis.getGanador())
        
    def test_jugador1_ventaja(self):
        jugador1=Jugador()
        jugador2=Jugador()
    
        tenis=Tenis(jugador1,jugador2)

        tenis.p1ganaPunto()
        tenis.p1ganaPunto()
        tenis.p1ganaPunto()
        
            
        tenis.p2ganaPunto()
        tenis.p2ganaPunto()
        tenis.p2ganaPunto()
        tenis.p1ganaPunto()

        self.assertEquals(4,jugador1.getPuntaje())
        self.assertEquals(3,jugador2.getPuntaje())

        self.assertEqual(jugador1,tenis.getVentaja())

    def test_jugador2_ventaja(self):
        jugador1=Jugador()
        jugador2=Jugador()
    
        tenis=Tenis(jugador1,jugador2)

        tenis.p1ganaPunto()
        tenis.p1ganaPunto()
        tenis.p1ganaPunto()
        

        
        
            
        tenis.p2ganaPunto()
        tenis.p2ganaPunto()
        tenis.p2ganaPunto()
        tenis.p2ganaPunto()
        self.assertEquals(4,jugador2.getPuntaje())
        self.assertEquals(3,jugador1.getPuntaje())

        self.assertEqual(jugador2,tenis.getVentaja())





        

