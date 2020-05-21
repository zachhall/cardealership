// Interfaces normally follow a naming convention similar to classes
// but they end in '-ible' or '-able'
// Usually adjective because we usually interfaces to provide additional capabilities

interface Leaseable {
    boolean isLeaseable();

    int getLeaseTerm();

    int getMaxMilesPerYear();
}