                                      
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.appliancesinfo;

/**
 *
 * @author aryan
 */
public class TableObject {
    private String modNumber, modName, modCategory, Range, modDiscount;
    private long modPrice; 

    public TableObject(String modNumber, String modName, String modCategory, String Range, String modPrice, String modDiscount) {
        this.modNumber = modNumber;
        this.modName = modName;
        this.modCategory = modCategory;
        this.Range = Range;
        this.modPrice = Long.parseLong(modPrice);
        this.modDiscount = modDiscount;
    }

    public String getModNumber() {
        return modNumber;
    }

    public String getModName() {
        return modName;
    }

    public String getModCategory() {
        return modCategory;
    }

    public String getRange() {
        return Range;
    }

    public long getModPrice() {
        return modPrice;
    }

    public String getModDiscount() {
        return modDiscount;
    }
    
    
  
            
    
    
    

    
}
