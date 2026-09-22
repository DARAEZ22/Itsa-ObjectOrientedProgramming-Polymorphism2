package polimorfismo_2;

public class Producto <K,V>{
private K clave;
private V valor;

public Producto(K clave,V valor) {
	this.clave=clave;
	this.valor=valor;
}
public K getclave() {
	return clave;
}
public void setclave(K clave) {
	this.clave=clave;
}
public V getvalor() {
	return valor;
}
public void setvalor(V valor){
	this.valor=valor;
}

}
