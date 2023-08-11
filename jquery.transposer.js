$(document).ready(function() {
        var match;
        var chordss =['Cm','C#m','Dm','Ebm','Em','Fm','F#m','Gm','Abm','Am','Bbm','Bm','Cm','Dbm','D#m','Em','Fm','Gbm','G#m','Am','A#m','Cm'];
        var chordsRegex = /C#m|D#m|F#m|G#m|A#m|Dbm|Ebm|Gbm|Abm|Bbm|Cm|Dm|Em|Fm|Gm|Am|Bm/g;
        $('#transposeUp').click(function() {
            $('.chords').each(function() {
                var currentChord = $(this).text();
                var output = "";
                var parts = currentChord.split(chordsRegex);
                var index = 0;
                while (match = chordsRegex.exec(currentChord))
                {
                    var chordIndex = chordss.indexOf(match[0]);
                    output += parts[index++] + chordss[chordIndex+1];
                }
                output += parts[index];
                $(this).text(output);
            });
        });
        $('#transposeDown').click(function() {
            $('.chords').each(function() {
                var currentChord = $(this).text();
                var output = "";
                var parts = currentChord.split(chordsRegex);
                var index = 0;
                while (match = chordsRegex.exec(currentChord))
                {
                    var chordIndex = chordss.indexOf(match[0],1);
                    output += parts[index++] + chordss[chordIndex-1];
                }
                output += parts[index];
                $(this).text(output);
            });
        });
      });