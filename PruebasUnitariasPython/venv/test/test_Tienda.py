import sys
sys.path.insert(0,"./src")
from src.Tienda import Tienda
import unittest

class ProbarTiendas(unittest.TestCase):
    def test_prueba_cero(self):
        tienda=Tienda()
        tienda.add_cart(3,1)
        self.assertEqual(tienda.cantidad_total(),310.0)

    def test_prueba_uno(self):
        tienda = Tienda()
        tienda.add_cart(1,3)
        tienda.add_cart(2,1)
        tienda.add_cart(3,1)
        self.assertEqual(1110.0,tienda.calcular_total)
