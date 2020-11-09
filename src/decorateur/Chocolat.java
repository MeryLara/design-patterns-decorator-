package decorateur;

import dec.Boisson;

public class Chocolat extends DecorateurBoisson{

	public Chocolat(Boisson boisson) {
		super(boisson);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cout() {
		return 1.5+boisson.cout();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return boisson.getDescription()+" au chocolat";
	}

}
