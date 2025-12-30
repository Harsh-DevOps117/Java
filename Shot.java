import java.util.Arrays;

public class Shot {
  public static void main(String[] args) {
    int n = 3;
    int[] arr = new int[n];
    boolean[] visited = new boolean[n];
    Arrays.fill(visited, false);
    dijkstra(n, arr, visited, 0);
  }

  public static void dijkstra(int n, int[] arr, boolean[] visited, int start) {
    if (start == n) {
      for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
      }
      System.out.println();
    } else {
      for (int i = 0; i < n; i++) {
        if (!visited[i]) {
          arr[start] = i;
          visited[i] = true;
          dijkstra(n, arr, visited, start + 1);
          visited[i] = false;
        }
      }
    }
  }
}
