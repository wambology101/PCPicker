/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcpickerdesktop.parts;
import  pcpickerdesktop.lib.Parts;

/**
 *
 * @author appbenigno
 */
public class Mouse extends pcpickerdesktop.lib.PCPart {
    private Parts.Type partType = Parts.Type.Chassis;
    
    public Mouse()
    {}
    
    public Mouse(int _id, String _name, String _description, String _manufacturer, String _branch, int _quantity)
    {
        super(_id, _name, _description, _manufacturer, _branch, _quantity);
    }
    
    public String Type()
    {
        return partType.toString();
    }
}
