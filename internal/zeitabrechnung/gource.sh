#!/bin/bash

gource --disable-progress --disable-bloom --stop-at-end -640x480 --output-ppm-stream - | ffmpeg -y -b 3000K -r 60 -f image2pipe -vcodec ppm -i - gource.mp4
