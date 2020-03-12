class Tienda:
    def __init__(self):
        self.__camisas=[
            {
                "tipo":"camisa manga corta",
                "precio":190},
            {
                "tipo":"camisa manga larga casual",
                "precio":230},
            {
                "tipo":"camisa manga larga formal",
                "precio":310}
        ]


    def add_cart(self,tipo,cantidad):
        self.__camisas[tipo-1]["cantidad"]=cantidad

    def cantidad_total(self):
        total=0.0
        cantidad=self.__camisas[0]["cantidad"] + self.__camisas[1]["cantidad"] + self.__camisas[2]["cantidad"]
        sub_total=self.__camisas[0]["cantidad"]*self.__camisas[0]["precio"] +self.__camisas[1]["cantidad"]*self.__camisas[1]["precio"]+self.__camisas[2]["cantidad"]*self.__camisas[0]["precio"]
        if cantidad <=2:
            total=sub_total
        elif cantidad>2 and cantidad<=5:
            total=sub_total*0.95

        else:
            total=sub_total*0.92

        return total
