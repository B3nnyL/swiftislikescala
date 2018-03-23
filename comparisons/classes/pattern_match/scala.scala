//TypeScript doesn't have pattern matching functionality built in

var movieCount = 0
var songCount = 0

type item = Movie | Song;

const piece = Movie(name: 'Nine');
if (typeof piece === 'Movie'){
  movieCount ++;
} else if (typeof piece === 'Song'){
  songCount ++;
}