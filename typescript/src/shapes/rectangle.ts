class  Rectangle implements Shape {
    private width: number;
    private height: number;
    constructor( height: number , width: number){
        this.height = height;
        this.width = width;
    }
    computeArea():number{
        return this.width * this.height;
    }
}



export { Rectangle }
