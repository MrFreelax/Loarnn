package Element.motionless;

import java.awt.*;

import model.Permeability;
import model.Sprite;

class Gate extends MotionlessElement {
	
	/** The Constant SPRITE. */
	private static final Sprite SPRITE = new Sprite('H',"gate_closed.png");
	

	/** Instantiates a new Gate. */
	Gate(){
		super(SPRITE, Permeability.BLOCKING);
	}


	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}

}