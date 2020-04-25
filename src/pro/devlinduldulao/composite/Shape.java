package pro.devlinduldulao.composite;

import pro.devlinduldulao.strategy.Compressor;

public class Shape implements Component {

    @Override
    public void render() {
        System.out.println("Render Shape");
    }

    @Override
    public void move() {
        System.out.println("Move Shape");
    }
}
