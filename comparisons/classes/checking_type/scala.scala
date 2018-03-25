var movieCount = 0;
var songCount = 0;
 
for (let item of library) {
    if (item instanceof Movie) {
        movieCount += 1;
    } else if (item instanceof Song) {
        songCount += 1;
    }
}
