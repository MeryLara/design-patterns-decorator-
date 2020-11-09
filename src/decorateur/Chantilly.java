package decorateur;

import dec.Boisson;

public class Chantilly extends DecorateurBoisson{

	public Chantilly(Boisson boisson) {
		super(boisson);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cout() {
		return 2.5+boisson.cout();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return boisson.getDescription()+" avec chantilly";
	}

}
