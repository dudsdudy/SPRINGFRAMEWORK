class Carro {

    String cor;
    String modelo;
    Int capacidadeTanque;

    Carro(){

    }

    Carro (String cor, String modelo, Int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque; 
    }
    

//Construtor aqui

void setCor(String cor){
    this.cor;
}

void getCor(){
    return cor;
}

void setModelo(String modelo){
    this.modelo = modelo;
}

void getModelo(){
    return modelo;
}

void setcapacidadeTanque(int capacidadeTanque){
    this.capacidadeTanque = capacidadeTanque
}

int getcapacidadeTanque(){
    return capacidadeTanque
}


// get e set tanque


// metodo do total para encher o tanque


double totalValorTanque (double valorCombustivel){
    return capacidadeTanque * valorCombustivel;
}

}