const vertices = ["S","A", "B", "C", "D", "E"];
const key = 'S';

const graph = [
    {from : "S", to : "A", cost: 4},
    {from : "S", to :"E", cost: -5},
    {from : "A", to :"C", cost: 6},
    {from : "B", to :"A", cost: 3},
    {from : "C", to :"B", cost: -2},
    {from : "D", to :"C", cost: 3},
    {from : "D", to :"A", cost: 10},
    {from : "E", to: "D", cost: 8}
  ];

  const bellmanFord = () => {
      const memo = {};
      for( let i = 0 ; i < vertices.length; i++) {
          memo[vertices[i]] = Infinity;
      }
      memo[key] = 0;

      for(let x = 0 ; x < vertices.length - 1 ; x++) {
        for(let i = 0 ; i < vertices.length; i++) {
            const edges = graph.filter(path => path.from === vertices[i])
            for(edge of edges) {
                if(edge.cost + memo[edge.from] < memo[edge.to]) {
                    memo[edge.to] = edge.cost + memo[edge.from];
                }
            }
        }
      }
      
      return memo;
  } 

  console.log('bellmanFord', bellmanFord())