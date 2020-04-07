/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import ico.fes.is.celulares.*;
import ico.fes.is.factory.CelFactoryi;

/**
 *
 * @author silve
 */
public class CelularFactory implements CelFactoryi{
    
    public static Celular createCelular(int tipo){
        
        switch(tipo){
            case CelFactoryi.HUAWEI_30P_LITE:
                return new Huawei(6.15, "Android 9 Pie,EMUI 9.0", "lirin 710,8 nucleos,2.2Ghz", "120GB", "1 lente 32MP", "3 lentes 24mp", 4, "2.240mAh");
               
            case CelFactoryi.HUAWEI_30P_PRO:
                return new Huawei(6.7, "Android 9 Pie,EMUI 9.0","2.6GHz Kirin 980 (ocho nucleos)", "256Gb", "1 lente 32MP","4 lentes 40MP", 8, "4200mAh");
                
            case CelFactoryi.IPHONE_X_PRO_MAX:
                return new Iphone(6.5, "iOS 13", "Apple A13 Bionic (seis nucleos)", "512GB", "1 lente 12MP", "4 lentes 12MP", 8, "3,179mAh");
            case CelFactoryi.IPHONE_X:
                return new Iphone(5.8, "iOS 13", "Hexa-core 2.39 Ghz", "256Gb", "1 lente 7MP", "2 lentes 12MP", 3, "2.716mAh");
            case CelFactoryi.SAMGUNG_GALAXY_A50:
                return new  Samgung(6.4, "Android 9.0 " ,"Cortex A72 4 nucleos,2.35Ghz  ","512Gb ","1 lente 25MP","3 lentes 25MP y 8Mp", 4,"4000mAh");
                
        }
        return null;
        
    }
    
    
}
