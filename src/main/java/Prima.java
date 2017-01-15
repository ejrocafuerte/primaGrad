
public class Prima {
	private int edad=0;
	private String sexo="";
	private String estadoC = "";
	
	public Prima(int edad, String sexo, String estadoC) {
		super();
		this.edad = edad;
		this.sexo = sexo;
		this.estadoC = estadoC;
	}

	public int getPrima(){
		int prima = 500;
		
		if (edad<18 || edad>80){
			return -1;
		}else{
			if ((sexo.equals("M") || sexo.equals("F"))){ 
				if (estadoC.equals("C") || estadoC.equals("S")){
					if (sexo.equals("M") && estadoC.equals("S") && edad < 25){
						prima+=1500;
					}
					if(sexo.equals("F") || estadoC.equals("C"))	{
						prima-=200;
					}
					if(edad >= 45 && edad < 65){
						prima-=100;
					}
				}else{
					return -1;
				}
			}else{
				return -1;
			}
		}		
		return prima;
	}
}
