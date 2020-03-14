import Jugador 


class Tenis:

    def __init__(self,jugador1,jugador2):
        self.__jugador1 = jugador1
        self.__jugador2 = jugador2
        self.__ventaja = None
        self.__ganador = None

    # se consideera deuce cuando ambos jugadores tienen 3 puntos y ninguno tiene ventaja

    def isDeuce(self):
        if self.__jugador1.getPuntaje()==3 and self.__jugador1.getPuntaje()==self.__jugador2.getPuntaje():
            
            return True
        else:
            return False
        

    # se concidera ventaja cuando uno de los jugadores en el estado de deuce anota un punto

    
    def isVentaja(self):
        if self.__jugador1.getPuntaje()>=3 and self.__jugador1.getPuntaje()==self.__jugador2.getPuntaje()+1:

            self.setVentaja(self.__jugador1)
            return True

        elif  self.__jugador2.getPuntaje()>=3 and self.__jugador2.getPuntaje()==self.__jugador1.getPuntaje()+1:

            self.setVentaja(self.__jugador2)
            return True
        else:
            return False

       

    def p1ganaPunto(self):

        if self.__jugador1.getPuntaje()<3:
            self.__jugador1.addPuntaje()

        elif self.__jugador1.getPuntaje()==3:
            self.__jugador1.addPuntaje()
            if self.getVentaja()==self.__jugador2:
                self.__jugador2.delPuntaje()
                
            self.setVentaja(self.__jugador1)
        
        elif self.getVentaja() == self.__jugador1:
            self.__jugador1.addPuntaje()
            self.setGanador(self.__jugador1)

       
        
            

    
    def p2ganaPunto(self):
        if self.__jugador2.getPuntaje()<3:
            self.__jugador2.addPuntaje()

        elif self.__jugador2.getPuntaje()==3:
            self.__jugador2.addPuntaje()

            if self.getVentaja()==self.__jugador1:
                self.__jugador1.delPuntaje()

            self.setVentaja(self.__jugador2)
        
        elif self.getVentaja() == self.__jugador2:
            self.__jugador2.addPuntaje()
            self.setGanador(self.__jugador2)
            

    def getVentaja(self):
        return self.__ventaja

    def setVentaja(self,jugador):
        self.__ventaja=jugador

    def getGanador(self):
        return self.__ganador

    def setGanador(self,jugador):
        self.__ganador=jugador




    