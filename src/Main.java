import java.util.*;

import org.jgrapht.*;
import org.jgrapht.alg.DijkstraShortestPath;
import org.jgrapht.graph.*;

public class Main {

	private static DefaultDirectedGraph<TupleContainer, DefaultEdge> Graph;

	public static void main(String[] args) {
		DijkstraShortestPath<TupleContainer, DefaultEdge> dijkstra;

		TupleContainer startNode = new TupleContainer(10, 7, 4);

		Graph = new DefaultDirectedGraph<TupleContainer, DefaultEdge>(
				DefaultEdge.class);

		fillGraph(startNode);

		dijkstra = createDijkstraPath(startNode, startNode);
		if (isAExist(2) != null)
			for (TupleContainer tempTupleContainer : isAExist(2)) {
				dijkstra = createDijkstraPath(startNode, tempTupleContainer);
				if (dijkstra.getPathEdgeList() != null) {
					System.out.println("Looking For: " + tempTupleContainer);
					System.out.println("Depth Level: "
							+ dijkstra.getPathLength());
					Iterator<DefaultEdge> it = dijkstra.getPathEdgeList()
							.iterator();
					while (it.hasNext())
						System.out.println(it.next());
				}
				System.out.println("****************************************");
			}

	}

	public static void fillGraph(TupleContainer temp) {
		TupleContainer initialState = temp.clone();
		TupleContainer currentState = initialState;
		Iterator<TupleContainer> it, it_1, it_2, it_3, it_4, it_5, it_6, it_7, it_8, it_9, it_10;
		TupleContainer tempTupleContainer;
		Graph.addVertex(initialState);

		it = addAdjacentEdgesToTuple(currentState).iterator();
		while (it.hasNext()) {
			tempTupleContainer = it.next();
			if (tempTupleContainer.MixUpContainers().isEmpty() == false) {
				it_1 = addAdjacentEdgesToTuple(tempTupleContainer).iterator();
				while (it_1.hasNext()) {
					tempTupleContainer = it_1.next();
					if (tempTupleContainer.MixUpContainers().isEmpty() == false) {
						it_2 = addAdjacentEdgesToTuple(tempTupleContainer)
								.iterator();
						while (it_2.hasNext()) {
							tempTupleContainer = it_2.next();
							if (tempTupleContainer.MixUpContainers().isEmpty() == false) {
								it_3 = addAdjacentEdgesToTuple(
										tempTupleContainer).iterator();
								while (it_3.hasNext()) {
									tempTupleContainer = it_3.next();
									if (tempTupleContainer.MixUpContainers()
											.isEmpty() == false) {
										it_4 = addAdjacentEdgesToTuple(
												tempTupleContainer).iterator();
										while (it_4.hasNext()) {
											tempTupleContainer = it_4.next();
											if (tempTupleContainer
													.MixUpContainers()
													.isEmpty() == false) {
												it_5 = addAdjacentEdgesToTuple(
														tempTupleContainer)
														.iterator();
												while (it_5.hasNext()) {
													tempTupleContainer = it_5
															.next();
													if (tempTupleContainer
															.MixUpContainers()
															.isEmpty() == false) {
														it_6 = addAdjacentEdgesToTuple(
																tempTupleContainer)
																.iterator();
														while (it_6.hasNext()) {
															tempTupleContainer = it_6
																	.next();
															if (tempTupleContainer
																	.MixUpContainers()
																	.isEmpty() == false) {
																it_7 = addAdjacentEdgesToTuple(
																		tempTupleContainer)
																		.iterator();
																while (it_7
																		.hasNext()) {
																	tempTupleContainer = it_7
																			.next();
																	if (tempTupleContainer
																			.MixUpContainers()
																			.isEmpty() == false) {
																		it_8 = addAdjacentEdgesToTuple(
																				tempTupleContainer)
																				.iterator();
																		while (it_8
																				.hasNext()) {
																			tempTupleContainer = it_8
																					.next();
																			if (tempTupleContainer
																					.MixUpContainers()
																					.isEmpty() == false) {
																				it_9 = addAdjacentEdgesToTuple(
																						tempTupleContainer)
																						.iterator();
																				while (it_9
																						.hasNext()) {
																					tempTupleContainer = it_9
																							.next();
																					if (tempTupleContainer
																							.MixUpContainers()
																							.isEmpty() == false) {
																						it_10 = addAdjacentEdgesToTuple(
																								tempTupleContainer)
																								.iterator();

																						while (it_10
																								.hasNext()) {
																							tempTupleContainer = it_10
																									.next();
																							if (tempTupleContainer
																									.MixUpContainers()
																									.isEmpty() == false) {
																								addAdjacentEdgesToTuple(
																										tempTupleContainer)
																										.iterator();

																							}
																						}

																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

	}

	public static Collection<TupleContainer> addAdjacentEdgesToTuple(
			TupleContainer currentState) {
		TupleContainer tempTupleContainer;
		Collection<TupleContainer> CollectionLevel;
		Iterator<TupleContainer> it;

		CollectionLevel = currentState.MixUpContainers();
		it = CollectionLevel.iterator();

		while (it.hasNext()) {
			tempTupleContainer = it.next();
			if (graphContains(tempTupleContainer) == null)
				Graph.addVertex(tempTupleContainer);
			else
				tempTupleContainer = graphContains(tempTupleContainer);
			try {
				Graph.addEdge(currentState, tempTupleContainer);
			} catch (Exception e) {

			}
		}
		return CollectionLevel;
	}

	public static TupleContainer graphContains(TupleContainer tempTupleContainer) {
		Iterator<TupleContainer> it = Graph.vertexSet().iterator();
		TupleContainer tempObject;
		while (it.hasNext()) {
			tempObject = it.next();
			if (tempObject.equals(tempTupleContainer))
				return tempObject;
		}
		return null;
	}

	public static String GraphToString() {
		Iterator<TupleContainer> it = Graph.vertexSet().iterator();
		String str = "";
		while (it.hasNext())
			str += it.next() + "\n";
		return str;
	}

	public static int GraphSize() {
		HashSet<TupleContainer> hashSet = new HashSet<TupleContainer>();

		int i = 0;
		Iterator<TupleContainer> it = Graph.vertexSet().iterator();
		while (it.hasNext()) {
			i++;
			hashSet.add(it.next());
		}
		return hashSet.size();
	}

	public static DijkstraShortestPath<TupleContainer, DefaultEdge> createDijkstraPath(
			TupleContainer start, TupleContainer end) {
		DijkstraShortestPath<TupleContainer, DefaultEdge> d = new DijkstraShortestPath<TupleContainer, DefaultEdge>(
				Graph, start.clone(), end.clone());
		return d;
	}

	public static List<TupleContainer> isAExist(int a) {
		List<TupleContainer> list = new ArrayList<>();
		Iterator<TupleContainer> it = Graph.vertexSet().iterator();
		TupleContainer tempPointer;
		while (it.hasNext()) {
			tempPointer = it.next();
			if (tempPointer.X.getCurrentVolume() == a
					|| tempPointer.Y.getCurrentVolume() == a
					|| tempPointer.Z.getCurrentVolume() == a)
				list.add(tempPointer);
		}
		return list;
	}
}
