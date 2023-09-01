import { Rectangle } from "./shapes/rectangle.js";

function newRenderer(Shape: Shape) {
    return {
        draw() {
            const area: number = Shape.computeArea()
            console.log("Shape drawn\n" + "Its area is " + area)
        }
    }
}

export { newRenderer }