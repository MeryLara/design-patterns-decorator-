package decorateur;

import dec.Boisson;

public class Vani extends DecorateurBoisson{

	public Vani(Boisson boisson) {
		super(boisson);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cout() {
		return 2+boisson.cout();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return boisson.getDescription()+" avec vani";
	}

}
