package name.luoyong.spring.aspect.animal;

import org.springframework.stereotype.Component;

@Component
public class Fox {
	
	public void findChicken() {
		System.out.println("fox find chicken");
	}
	
	public void stealChicken() {
		System.out.println("fox steal chicken");
	}

}
