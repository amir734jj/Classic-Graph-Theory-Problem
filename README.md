# Classic-Graph-Theory-Problem


[Three Glass Puzzle](http://www.cut-the-knot.org/wgraph.shtml): Find all possible solutions for 3 containers with capacities: 10, 7, 4


    Looking For: TupleContainer [X=< Capacity: 10 , Current Volume: 2 >, Y=< Capacity: 7 , Current Volume: 5 >, Z=< Capacity: 4 , Current Volume: 4 >]
    Depth Level: 5.0
    (TupleContainer [X=< Capacity: 10 , Current Volume: 0 >, Y=< Capacity: 7 , Current Volume: 7 >, Z=< Capacity: 4 , Current Volume: 4 >] : TupleContainer [X=< Capacity: 10 , Current Volume: 4 >, Y=< Capacity: 7 , Current Volume: 7 >, Z=< Capacity: 4 , Current Volume: 0 >])
    (TupleContainer [X=< Capacity: 10 , Current Volume: 4 >, Y=< Capacity: 7 , Current Volume: 7 >, Z=< Capacity: 4 , Current Volume: 0 >] : TupleContainer [X=< Capacity: 10 , Current Volume: 10 >, Y=< Capacity: 7 , Current Volume: 1 >, Z=< Capacity: 4 , Current Volume: 0 >])
    (TupleContainer [X=< Capacity: 10 , Current Volume: 10 >, Y=< Capacity: 7 , Current Volume: 1 >, Z=< Capacity: 4 , Current Volume: 0 >] : TupleContainer [X=< Capacity: 10 , Current Volume: 6 >, Y=< Capacity: 7 , Current Volume: 1 >, Z=< Capacity: 4 , Current Volume: 4 >])
    (TupleContainer [X=< Capacity: 10 , Current Volume: 6 >, Y=< Capacity: 7 , Current Volume: 1 >, Z=< Capacity: 4 , Current Volume: 4 >] : TupleContainer [X=< Capacity: 10 , Current Volume: 6 >, Y=< Capacity: 7 , Current Volume: 5 >, Z=< Capacity: 4 , Current Volume: 0 >])
    (TupleContainer [X=< Capacity: 10 , Current Volume: 6 >, Y=< Capacity: 7 , Current Volume: 5 >, Z=< Capacity: 4 , Current Volume: 0 >] : TupleContainer [X=< Capacity: 10 , Current Volume: 2 >, Y=< Capacity: 7 , Current Volume: 5 >, Z=< Capacity: 4 , Current Volume: 4 >])
    ****************************************
    Looking For: TupleContainer [X=< Capacity: 10 , Current Volume: 2 >, Y=< Capacity: 7 , Current Volume: 7 >, Z=< Capacity: 4 , Current Volume: 2 >]
    Depth Level: 6.0
    (TupleContainer [X=< Capacity: 10 , Current Volume: 0 >, Y=< Capacity: 7 , Current Volume: 7 >, Z=< Capacity: 4 , Current Volume: 4 >] : TupleContainer [X=< Capacity: 10 , Current Volume: 4 >, Y=< Capacity: 7 , Current Volume: 7 >, Z=< Capacity: 4 , Current Volume: 0 >])
    (TupleContainer [X=< Capacity: 10 , Current Volume: 4 >, Y=< Capacity: 7 , Current Volume: 7 >, Z=< Capacity: 4 , Current Volume: 0 >] : TupleContainer [X=< Capacity: 10 , Current Volume: 10 >, Y=< Capacity: 7 , Current Volume: 1 >, Z=< Capacity: 4 , Current Volume: 0 >])
    (TupleContainer [X=< Capacity: 10 , Current Volume: 10 >, Y=< Capacity: 7 , Current Volume: 1 >, Z=< Capacity: 4 , Current Volume: 0 >] : TupleContainer [X=< Capacity: 10 , Current Volume: 6 >, Y=< Capacity: 7 , Current Volume: 1 >, Z=< Capacity: 4 , Current Volume: 4 >])
    (TupleContainer [X=< Capacity: 10 , Current Volume: 6 >, Y=< Capacity: 7 , Current Volume: 1 >, Z=< Capacity: 4 , Current Volume: 4 >] : TupleContainer [X=< Capacity: 10 , Current Volume: 6 >, Y=< Capacity: 7 , Current Volume: 5 >, Z=< Capacity: 4 , Current Volume: 0 >])
    (TupleContainer [X=< Capacity: 10 , Current Volume: 6 >, Y=< Capacity: 7 , Current Volume: 5 >, Z=< Capacity: 4 , Current Volume: 0 >] : TupleContainer [X=< Capacity: 10 , Current Volume: 2 >, Y=< Capacity: 7 , Current Volume: 5 >, Z=< Capacity: 4 , Current Volume: 4 >])
    (TupleContainer [X=< Capacity: 10 , Current Volume: 2 >, Y=< Capacity: 7 , Current Volume: 5 >, Z=< Capacity: 4 , Current Volume: 4 >] : TupleContainer [X=< Capacity: 10 , Current Volume: 2 >, Y=< Capacity: 7 , Current Volume: 7 >, Z=< Capacity: 4 , Current Volume: 2 >])
    ****************************************
    Looking For: TupleContainer [X=< Capacity: 10 , Current Volume: 9 >, Y=< Capacity: 7 , Current Volume: 0 >, Z=< Capacity: 4 , Current Volume: 2 >]
    Depth Level: 7.0
    (TupleContainer [X=< Capacity: 10 , Current Volume: 0 >, Y=< Capacity: 7 , Current Volume: 7 >, Z=< Capacity: 4 , Current Volume: 4 >] : TupleContainer [X=< Capacity: 10 , Current Volume: 4 >, Y=< Capacity: 7 , Current Volume: 7 >, Z=< Capacity: 4 , Current Volume: 0 >])
    (TupleContainer [X=< Capacity: 10 , Current Volume: 4 >, Y=< Capacity: 7 , Current Volume: 7 >, Z=< Capacity: 4 , Current Volume: 0 >] : TupleContainer [X=< Capacity: 10 , Current Volume: 10 >, Y=< Capacity: 7 , Current Volume: 1 >, Z=< Capacity: 4 , Current Volume: 0 >])
    (TupleContainer [X=< Capacity: 10 , Current Volume: 10 >, Y=< Capacity: 7 , Current Volume: 1 >, Z=< Capacity: 4 , Current Volume: 0 >] : TupleContainer [X=< Capacity: 10 , Current Volume: 6 >, Y=< Capacity: 7 , Current Volume: 1 >, Z=< Capacity: 4 , Current Volume: 4 >])
    (TupleContainer [X=< Capacity: 10 , Current Volume: 6 >, Y=< Capacity: 7 , Current Volume: 1 >, Z=< Capacity: 4 , Current Volume: 4 >] : TupleContainer [X=< Capacity: 10 , Current Volume: 6 >, Y=< Capacity: 7 , Current Volume: 5 >, Z=< Capacity: 4 , Current Volume: 0 >])
    (TupleContainer [X=< Capacity: 10 , Current Volume: 6 >, Y=< Capacity: 7 , Current Volume: 5 >, Z=< Capacity: 4 , Current Volume: 0 >] : TupleContainer [X=< Capacity: 10 , Current Volume: 2 >, Y=< Capacity: 7 , Current Volume: 5 >, Z=< Capacity: 4 , Current Volume: 4 >])
    (TupleContainer [X=< Capacity: 10 , Current Volume: 2 >, Y=< Capacity: 7 , Current Volume: 5 >, Z=< Capacity: 4 , Current Volume: 4 >] : TupleContainer [X=< Capacity: 10 , Current Volume: 2 >, Y=< Capacity: 7 , Current Volume: 7 >, Z=< Capacity: 4 , Current Volume: 2 >])
    (TupleContainer [X=< Capacity: 10 , Current Volume: 2 >, Y=< Capacity: 7 , Current Volume: 7 >, Z=< Capacity: 4 , Current Volume: 2 >] : TupleContainer [X=< Capacity: 10 , Current Volume: 9 >, Y=< Capacity: 7 , Current Volume: 0 >, Z=< Capacity: 4 , Current Volume: 2 >])
    ****************************************
    Looking For: TupleContainer [X=< Capacity: 10 , Current Volume: 9 >, Y=< Capacity: 7 , Current Volume: 2 >, Z=< Capacity: 4 , Current Volume: 0 >]
    Depth Level: 8.0
    (TupleContainer [X=< Capacity: 10 , Current Volume: 0 >, Y=< Capacity: 7 , Current Volume: 7 >, Z=< Capacity: 4 , Current Volume: 4 >] : TupleContainer [X=< Capacity: 10 , Current Volume: 4 >, Y=< Capacity: 7 , Current Volume: 7 >, Z=< Capacity: 4 , Current Volume: 0 >])
    (TupleContainer [X=< Capacity: 10 , Current Volume: 4 >, Y=< Capacity: 7 , Current Volume: 7 >, Z=< Capacity: 4 , Current Volume: 0 >] : TupleContainer [X=< Capacity: 10 , Current Volume: 10 >, Y=< Capacity: 7 , Current Volume: 1 >, Z=< Capacity: 4 , Current Volume: 0 >])
    (TupleContainer [X=< Capacity: 10 , Current Volume: 10 >, Y=< Capacity: 7 , Current Volume: 1 >, Z=< Capacity: 4 , Current Volume: 0 >] : TupleContainer [X=< Capacity: 10 , Current Volume: 6 >, Y=< Capacity: 7 , Current Volume: 1 >, Z=< Capacity: 4 , Current Volume: 4 >])
    (TupleContainer [X=< Capacity: 10 , Current Volume: 6 >, Y=< Capacity: 7 , Current Volume: 1 >, Z=< Capacity: 4 , Current Volume: 4 >] : TupleContainer [X=< Capacity: 10 , Current Volume: 6 >, Y=< Capacity: 7 , Current Volume: 5 >, Z=< Capacity: 4 , Current Volume: 0 >])
    (TupleContainer [X=< Capacity: 10 , Current Volume: 6 >, Y=< Capacity: 7 , Current Volume: 5 >, Z=< Capacity: 4 , Current Volume: 0 >] : TupleContainer [X=< Capacity: 10 , Current Volume: 2 >, Y=< Capacity: 7 , Current Volume: 5 >, Z=< Capacity: 4 , Current Volume: 4 >])
    (TupleContainer [X=< Capacity: 10 , Current Volume: 2 >, Y=< Capacity: 7 , Current Volume: 5 >, Z=< Capacity: 4 , Current Volume: 4 >] : TupleContainer [X=< Capacity: 10 , Current Volume: 2 >, Y=< Capacity: 7 , Current Volume: 7 >, Z=< Capacity: 4 , Current Volume: 2 >])
    (TupleContainer [X=< Capacity: 10 , Current Volume: 2 >, Y=< Capacity: 7 , Current Volume: 7 >, Z=< Capacity: 4 , Current Volume: 2 >] : TupleContainer [X=< Capacity: 10 , Current Volume: 9 >, Y=< Capacity: 7 , Current Volume: 0 >, Z=< Capacity: 4 , Current Volume: 2 >])
    (TupleContainer [X=< Capacity: 10 , Current Volume: 9 >, Y=< Capacity: 7 , Current Volume: 0 >, Z=< Capacity: 4 , Current Volume: 2 >] : TupleContainer [X=< Capacity: 10 , Current Volume: 9 >, Y=< Capacity: 7 , Current Volume: 2 >, Z=< Capacity: 4 , Current Volume: 0 >])
    ****************************************
    Looking For: TupleContainer [X=< Capacity: 10 , Current Volume: 5 >, Y=< Capacity: 7 , Current Volume: 2 >, Z=< Capacity: 4 , Current Volume: 4 >]
    Depth Level: 8.0
    (TupleContainer [X=< Capacity: 10 , Current Volume: 0 >, Y=< Capacity: 7 , Current Volume: 7 >, Z=< Capacity: 4 , Current Volume: 4 >] : TupleContainer [X=< Capacity: 10 , Current Volume: 4 >, Y=< Capacity: 7 , Current Volume: 7 >, Z=< Capacity: 4 , Current Volume: 0 >])
    (TupleContainer [X=< Capacity: 10 , Current Volume: 4 >, Y=< Capacity: 7 , Current Volume: 7 >, Z=< Capacity: 4 , Current Volume: 0 >] : TupleContainer [X=< Capacity: 10 , Current Volume: 4 >, Y=< Capacity: 7 , Current Volume: 3 >, Z=< Capacity: 4 , Current Volume: 4 >])
    (TupleContainer [X=< Capacity: 10 , Current Volume: 4 >, Y=< Capacity: 7 , Current Volume: 3 >, Z=< Capacity: 4 , Current Volume: 4 >] : TupleContainer [X=< Capacity: 10 , Current Volume: 8 >, Y=< Capacity: 7 , Current Volume: 3 >, Z=< Capacity: 4 , Current Volume: 0 >])
    (TupleContainer [X=< Capacity: 10 , Current Volume: 8 >, Y=< Capacity: 7 , Current Volume: 3 >, Z=< Capacity: 4 , Current Volume: 0 >] : TupleContainer [X=< Capacity: 10 , Current Volume: 8 >, Y=< Capacity: 7 , Current Volume: 0 >, Z=< Capacity: 4 , Current Volume: 3 >])
    (TupleContainer [X=< Capacity: 10 , Current Volume: 8 >, Y=< Capacity: 7 , Current Volume: 0 >, Z=< Capacity: 4 , Current Volume: 3 >] : TupleContainer [X=< Capacity: 10 , Current Volume: 1 >, Y=< Capacity: 7 , Current Volume: 7 >, Z=< Capacity: 4 , Current Volume: 3 >])
    (TupleContainer [X=< Capacity: 10 , Current Volume: 1 >, Y=< Capacity: 7 , Current Volume: 7 >, Z=< Capacity: 4 , Current Volume: 3 >] : TupleContainer [X=< Capacity: 10 , Current Volume: 1 >, Y=< Capacity: 7 , Current Volume: 6 >, Z=< Capacity: 4 , Current Volume: 4 >])
    (TupleContainer [X=< Capacity: 10 , Current Volume: 1 >, Y=< Capacity: 7 , Current Volume: 6 >, Z=< Capacity: 4 , Current Volume: 4 >] : TupleContainer [X=< Capacity: 10 , Current Volume: 5 >, Y=< Capacity: 7 , Current Volume: 6 >, Z=< Capacity: 4 , Current Volume: 0 >])
    (TupleContainer [X=< Capacity: 10 , Current Volume: 5 >, Y=< Capacity: 7 , Current Volume: 6 >, Z=< Capacity: 4 , Current Volume: 0 >] : TupleContainer [X=< Capacity: 10 , Current Volume: 5 >, Y=< Capacity: 7 , Current Volume: 2 >, Z=< Capacity: 4 , Current Volume: 4 >])
    ****************************************
