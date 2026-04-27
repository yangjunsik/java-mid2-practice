package generic.problem.ex3.unit;

public class UnitPrinter {
    static <T extends Shuttle> void printV1(T shuttle){
        shuttle.showInfo();
    }

    static void printV2(Shuttle<?> shuttle){
        shuttle.showInfo();
    }
}
