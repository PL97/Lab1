package testFolder;

import static org.junit.Assert.*;
import java.io.FileNotFoundException;
import org.junit.Test;
import lab1.core.Graph;
import lab1.core.mainWindow;

public class test2 {

  @Test
  public void testCalcShortestPath2() throws FileNotFoundException {
    Graph aGraph = mainWindow.createDirectedGraph("noty.txt");
    //case 2
    String path = mainWindow.calcShortestPath(aGraph, "1world","the");
    assertEquals("No \"1world\" in the graph!", path);
  }

}
