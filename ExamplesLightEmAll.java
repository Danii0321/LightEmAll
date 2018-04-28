import java.util.*;

import tester.*;
import javalib.worldimages.*;

public class ExamplesLightEmAll {
  LightEmAll testGame1;
  LightEmAll testGame2;
  LightEmAll testGame3;
  LightEmAll testGame4;
  LightEmAll testGame5;
  LightEmAll testGame6;
  LightEmAll testGame7;
  LightEmAll testGame8;

  ArrayList<GamePiece> nodes1;
  GamePiece cell1;
  GamePiece cell2;
  GamePiece cell3;
  GamePiece cell4;

  GamePiece g1 = new GamePiece(0, 0, true, false, false, false, false, false);
  GamePiece g2 = new GamePiece(1, 1, false, true, false, false, false, false);
  GamePiece g3 = new GamePiece(0, 1, false, false, true, false, false, false);
  GamePiece g4 = new GamePiece(1, 0, false, false, false, true, false, false);
  GamePiece g5 = new GamePiece(2, 2, true, false, true, false, false, false);
  GamePiece g6 = new GamePiece(2, 1, false, false, true, false, false, false);
  GamePiece g7 = new GamePiece(2, 0, false, false, false, true, false, false);
  GamePiece g8 = new GamePiece(2, 1, true, false, true, false, false, false);

  GamePiece gconnect1 = new GamePiece(0, 0, false, false, false, true, false, true);
  GamePiece gconnect2 = new GamePiece(1, 0, false, false, true, false, false, false);
  GamePiece gconnect3 = new GamePiece(1, 0, true, true, false, false, false, false);

  Random rand = new Random();
  ArrayUtils utils = new ArrayUtils();

  ArrayList<Integer> a1 = new ArrayList<Integer>();
  Integer i1 = 1;
  Integer i2 = 2;
  Integer i3 = 3;
  Integer i4 = 4;

  HashMap<GamePiece, GamePiece> h1 = new HashMap<GamePiece, GamePiece>();

  ArrayList<Edge> exMst = new ArrayList<Edge>();
  Edge e1 = new Edge(g1, g2, 2);
  Edge e2 = new Edge(g2, g3, 4);
  Edge e3 = new Edge(g3, g4, 1);
  Edge e4 = new Edge(g4, g5, 3);

  ArrayList<Edge> exMst2 = new ArrayList<Edge>();
  Edge e30 = new Edge(g1, g2, 30);
  Edge e27 = new Edge(g2, g3, 27);
  Edge e29 = new Edge(g3, g4, 29);
  Edge e6 = new Edge(g4, g5, 6);
  Edge e28 = new Edge(g1, g2, 28);
  Edge e8 = new Edge(g2, g3, 8);
  Edge e17 = new Edge(g3, g4, 17);
  Edge e11 = new Edge(g4, g5, 11);

  void initConditions() {
    this.testGame1 = new LightEmAll(8, 8, false);
    this.testGame2 = new LightEmAll(14, 14, false);
    this.cell1 = new GamePiece(1, 1, false, true, false, false, false, false);
    this.cell2 = new GamePiece(1, 2, true, false, false, true, false, false);
    this.cell3 = new GamePiece(2, 1, false, true, false, false, true, true);
    this.cell4 = new GamePiece(2, 2, true, false, true, false, false, false);
    this.nodes1 = new ArrayList<GamePiece>(Arrays.asList(cell1, cell2, cell3, cell4));

    this.testGame3 = new LightEmAll(4, 4, false);
    this.testGame4 = new LightEmAll(8, 8);
    this.testGame5 = new LightEmAll(7, 7, false);
    this.testGame6 = new LightEmAll(8, 8, 2, 2, false, new ArrayList<Edge>());

    this.g1 = new GamePiece(0, 0, true, false, false, false, false, false);
    this.g2 = new GamePiece(1, 1, false, true, false, false, false, false);
    this.g3 = new GamePiece(0, 1, false, false, true, false, false, false);
    this.g4 = new GamePiece(1, 0, false, false, false, true, false, false);
    this.g5 = new GamePiece(2, 2, true, false, true, false, false, false);

    this.gconnect1 = new GamePiece(0, 0, false, false, false, true, false, true);
    this.gconnect2 = new GamePiece(1, 0, false, false, true, false, false, false);
    this.gconnect3 = new GamePiece(1, 0, true, true, false, false, false, false);

    this.utils = new ArrayUtils();

    this.a1 = new ArrayList<Integer>();
    this.i1 = 1;
    this.i2 = 2;
    this.i3 = 3;
    this.i4 = 4;

    a1.add(i1);
    a1.add(i2);
    a1.add(i3);
    a1.add(i4);

    this.h1 = new HashMap<GamePiece, GamePiece>();

    this.exMst = new ArrayList<Edge>();
    this.e1 = new Edge(g1, g2, 2);
    this.e2 = new Edge(g2, g3, 4);
    this.e3 = new Edge(g3, g4, 1);
    this.e4 = new Edge(g4, g5, 3);

    exMst.add(e1);
    exMst.add(e2);
    exMst.add(e3);
    exMst.add(e4);

    this.testGame7 = new LightEmAll(8, 8, 2, 2, false, exMst);

    this.exMst2 = new ArrayList<Edge>();
    this.e30 = new Edge(g1, g2, 30);
    this.e27 = new Edge(g2, g3, 27);
    this.e29 = new Edge(g3, g4, 29);
    this.e6 = new Edge(g4, g5, 6);
    this.e28 = new Edge(g1, g2, 28);
    this.e8 = new Edge(g2, g3, 8);
    this.e17 = new Edge(g3, g4, 17);
    this.e11 = new Edge(g4, g5, 11);

    this.exMst2.add(e30);
    this.exMst2.add(e27);
    this.exMst2.add(e29);
    this.exMst2.add(e6);
    this.exMst2.add(e28);
    this.exMst2.add(e8);
    this.exMst2.add(e17);
    this.exMst2.add(e11);

    this.testGame8 = new LightEmAll(8, 8, 2, 2, false, exMst2);
  }

  boolean testCreateNodes(Tester t) {
    initConditions();
    return t.checkExpect(testGame1.nodes.get(0),
        new GamePiece(1, 1, false, false, false, true, false, true));
  }

  boolean testisPowered(Tester t) {
    initConditions();
    GamePiece powerStation = this.testGame1.board.get(0).get(0);
    testGame1.isPowered(powerStation, false);
    return t.checkExpect(this.testGame1.board.get(2).get(3).powered, true)
        && t.checkExpect(this.testGame1.board.get(4).get(5).powered, true)
        && t.checkExpect(this.testGame1.board.get(6).get(1).powered, true);
  }

  boolean testBottomHelper(Tester t) {
    initConditions();
    ArrayList<GamePiece> nodes = testGame1.nodes;
    return t.checkExpect(testGame1.bottomHelper(nodes.get(0)), nodes.get(8))
        && t.checkExpect(testGame1.bottomHelper(nodes.get(10)), nodes.get(10))
        && t.checkExpect(testGame1.bottomHelper(nodes.get(20)), nodes.get(28));
  }

  boolean testTopHelper(Tester t) {
    initConditions();
    ArrayList<GamePiece> nodes = testGame1.nodes;
    return t.checkExpect(testGame1.topHelper(nodes.get(0)), nodes.get(0))
        && t.checkExpect(testGame1.topHelper(nodes.get(10)), nodes.get(2))
        && t.checkExpect(testGame1.topHelper(nodes.get(20)), nodes.get(12));
  }

  boolean testLeftHelper(Tester t) {
    initConditions();
    ArrayList<GamePiece> nodes = testGame1.nodes;
    return t.checkExpect(testGame1.leftHelper(nodes.get(0)), nodes.get(0))
        && t.checkExpect(testGame1.leftHelper(nodes.get(33)), nodes.get(33))
        && t.checkExpect(testGame1.leftHelper(nodes.get(34)), nodes.get(34));
  }

  boolean testRightHelper(Tester t) {
    initConditions();
    ArrayList<GamePiece> nodes = testGame1.nodes;
    return t.checkExpect(testGame1.rightHelper(nodes.get(0)), nodes.get(0))
        && t.checkExpect(testGame1.rightHelper(nodes.get(33)), nodes.get(33))
        && t.checkExpect(testGame1.rightHelper(nodes.get(35)), nodes.get(35));
  }

  void testCheckIfWon(Tester t) {
    initConditions();
    testGame1.checkIfWon();
    testGame2.checkIfWon();
    t.checkExpect(testGame1.isWon, false);
    t.checkExpect(testGame2.isWon, false);
  }

  boolean testFractalConnect(Tester t) {
    initConditions();
    ArrayList<GamePiece> nodes = testGame1.nodes;
    return t.checkExpect(nodes.get(0), new GamePiece(1, 1, false, false, false, true, false, true))
        && t.checkExpect(nodes.get(3), new GamePiece(1, 4, false, false, false, true, true, true))
        && t.checkExpect(nodes.get(5), new GamePiece(1, 6, false, false, false, true, false, false))
        && t.checkExpect(nodes.get(10), new GamePiece(2, 3, false, true, true, false, false, true));
  }

  boolean testMutualConnect(Tester t) {
    GamePiece g1 = new GamePiece(1, 1, false, false, false, false, false, false);
    GamePiece g2 = new GamePiece(4, 5, false, false, false, false, false, false);
    GamePiece g3 = new GamePiece(3, 2, false, false, false, false, false, false);
    GamePiece g4 = new GamePiece(6, 2, false, false, false, false, false, false);

    g1.mutualConnect(g2, "bottom");
    g3.mutualConnect(g4, "right");

    return t.checkExpect(g1.bottom, true) && t.checkExpect(g2.top, true)
        && t.checkExpect(g3.right, true) && t.checkExpect(g4.left, true);
  }

  void testRotate(Tester t) {
    this.initConditions();
    this.g1.rotate();
    this.g2.rotate();
    this.g3.rotate();
    this.g4.rotate();
    this.g5.rotate();

    t.checkExpect(this.g1, new GamePiece(0, 0, false, false, true, false, false, false));
    t.checkExpect(this.g2, new GamePiece(1, 1, false, false, false, true, false, false));
    t.checkExpect(this.g3, new GamePiece(0, 1, false, true, false, false, false, false));
    t.checkExpect(this.g4, new GamePiece(1, 0, true, false, false, false, false, false));
    t.checkExpect(this.g5, new GamePiece(2, 2, false, true, true, false, false, false));
  }

  boolean testConnect(Tester t) {
    this.initConditions();
    ArrayList<GamePiece> board = testGame1.nodes;
    return t.checkExpect(board.get(0), new GamePiece(1, 1, false, false, false, true, false, true))
        && t.checkExpect(board.get(27), new GamePiece(4, 4, true, false, true, false, false, true))
        && t.checkExpect(board.get(5),
            new GamePiece(1, 6, false, false, false, true, false, false));
  }

  boolean testCreateBoard(Tester t) {
    this.initConditions();
    ArrayList<GamePiece> board = testGame3.nodes;
    return t.checkExpect(board.get(0), new GamePiece(1, 1, false, false, false, true, false, true));
  }

  void testGetIndex(Tester t) {
    this.initConditions();
    t.checkExpect(this.testGame4.getIndex(new Posn(0, 0)), 0);
    t.checkExpect(this.testGame4.getIndex(new Posn(120, 75)), 11);
    t.checkExpect(this.testGame4.getIndex(new Posn(120, 0)), 3);
    t.checkExpect(testGame1.getIndex(new Posn(40, 100)), 17);
    t.checkExpect(testGame1.getIndex(new Posn(160, 20)), 4);
    t.checkExpect(testGame1.getIndex(new Posn(200, 300)), 61);
    t.checkExpect(testGame1.getIndex(new Posn(480, 150)), 36);
  }

  // test onMousePressed - how?
  void testOnMousePressed(Tester t) {
    this.initConditions();
    this.testGame4.onMousePressed(new Posn(0, 0));
  }

  void testPlacePowerCell(Tester t) {
    this.initConditions();
    this.testGame3.placePowerCell();
    t.checkExpect(this.testGame3.nodes.get(1).powerStation, true);
    t.checkExpect(this.testGame3.nodes.get(1).powered, true);
  }

  // test scramble - how?
  // checking it scrambles the correct number of GamePieces
  /*
   * void testScramble(Tester t) { this.initConditions();
   * t.checkExpect(this.testGame4.scrambleTest(new Random(), 4), 4);
   * t.checkExpect(this.testGame5.scrambleTest(new Random(), 9), 9); }
   */

  boolean testDiameter(Tester t) {
    initConditions();
    return t.checkExpect(testGame2.diameter(testGame2.nodes.get(0), false), 53)
        && t.checkExpect(testGame1.diameter(testGame1.nodes.get(0), false), 29);
  }

  /*
   * // testing to see if all possible connections have been made void
   * testBigBangStart(Tester t) { initConditions(); testGame6.connectAll();
   * testGame6.bigBang(testGame6.width * 40, testGame6.height * 40, 0.1); }
   */

  // Runs 8X8 UNscrambled

  void testBigBangStart(Tester t) {
    initConditions();
    testGame1.bigBang(testGame1.width * 40, testGame1.height * 40, 0.1);
  }

  // Runs 7X7 UNscrambled
  /*
   * void testBigBangStart(Tester t) { initConditions();
   * testGame5.bigBang(testGame5.width * 40, testGame5.height * 40, 0.1); }
   */

  // Runs 8X8 scrambled
  /*
   * void testBigBangStart(Tester t) { initConditions();
   * testGame4.bigBang(testGame4.width * 40, testGame4.height * 40, 0.1); }
   */

  // NEW:

  // findRep
  void testFindRep(Tester t) {
    this.initConditions();
    testGame7.setUpHash(h1);
    t.checkExpect(testGame7.findRep(g2), g1);
    t.checkExpect(testGame7.findRep(g3), g1);
    t.checkExpect(testGame7.findRep(g4), g1);
  }

  // setUpHash
  void testSetUpHash(Tester t) {
    this.initConditions();
    HashMap<GamePiece, GamePiece> newHash = testGame7.setUpHash(h1);
    t.checkExpect(newHash.get(g1), g1);
    t.checkExpect(newHash.get(g2), g2);
    t.checkExpect(newHash.get(g3), g3);
    t.checkExpect(newHash.get(g4), g4);
  }

  void testupHeap(Tester t) {
    this.initConditions();
    ArrayList<Edge> arr1 = new ArrayList<Edge>(Arrays.asList(this.e28, this.e27, this.e11));
    ArrayList<Edge> arr2 = new ArrayList<Edge>(Arrays.asList(this.e11, this.e27, this.e28));
    testGame7.upheap(0, arr1);
    testGame7.upheap(1, arr2);
    t.checkExpect(arr1.get(0), this.e28);
    t.checkExpect(arr1.get(0), this.e27);

  }

  // kruskalBuild
  void testKruskalBuild(Tester t) {
    this.initConditions();
    // ArrayList<Edge> theMst = testGame7.kruskalBuild();
    // t.checkExpect(theMst.get(0), e2);
  }

  // sortEdges
  void testSortEdges(Tester t) {
    /*
     * this.initConditions(); testGame7.setUpHash(h1); ArrayList<Edge> sorted =
     * testGame7.sortEdges(); t.checkExpect(sorted.get(0), e2);
     * t.checkExpect(sorted.get(1), e4); //t.checkExpect(sorted.get(2), e1);
     * //t.checkExpect(sorted.get(3), e2);
     * 
     * //order, sorted by weight: 4312 //should be: 4321
     * 
     */

    // this.initConditions();
    // System.out.println(exMst2);
    // ArrayList<Edge> heap = testGame8.sortEdges();
    // System.out.println(heap);
  }

  // connectAll
  void testConnectAll(Tester t) {
    this.initConditions();
    testGame6.connectAll();
    GamePiece g1 = testGame6.board.get(0).get(0);
    t.checkExpect(g1.bottom, true);
    t.checkExpect(g1.right, true);

    GamePiece g2 = testGame6.board.get(1).get(2);
    t.checkExpect(g2.bottom, true);
    t.checkExpect(g2.right, true);
    t.checkExpect(g2.top, true);
    t.checkExpect(g2.left, true);

    GamePiece g3 = testGame6.board.get(testGame6.height - 1).get(testGame6.width - 1);
    t.checkExpect(g3.top, true);
    t.checkExpect(g3.left, true);
  }

  // swap
  void testSwap(Tester t) {
    this.initConditions();
    utils.swap(0, 1, a1);
    t.checkExpect(a1.get(0), 2);
    t.checkExpect(a1.get(1), 1);

    utils.swap(2, 3, a1);
    t.checkExpect(a1.get(2), 4);
    t.checkExpect(a1.get(3), 3);

  }
}
