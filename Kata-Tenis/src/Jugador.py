class Jugador:

    def __init__(self):
        self.__puntaje=0
      


    def addPuntaje(self):
        self.__puntaje+=1

    def getPuntaje(self):
        return self.__puntaje

    def delPuntaje(self):
        self.__puntaje-=1


