import os
import sys
import datetime

def change_directory(new_path):
    tmp_file_path = os.path.join('/tmp','output_command_for_fix_script')
    fd = os.open(tmp_file_path, os.O_CREAT | os.O_RDWR)
    os.write(fd, bytes(f'cd {new_path}', encoding='utf-8'))
    os.close(fd)

entries = os.listdir()

most_recent_day = 0
most_recent_date = 20240205

for entry in entries:
    if entry.startswith('day'):
        day, date = entry.split('-')
        recent_day = int(day[3:])
        if recent_day > most_recent_day:
            most_recent_day = recent_day
            most_recent_date = int(date)

# create a directory with day{most_recent_day + 1}
today = int(datetime.datetime.strftime(datetime.datetime.now(), "%Y%m%d"))
#today = 20240214

new_path = ''

if most_recent_date == today:
    # cd to directory
    new_path = f'day{most_recent_day:02d}-{most_recent_date}'
else:
    # create a directory and cd
    dirpath = f'day{most_recent_day + 1:02d}-{today}'
    os.mkdir(dirpath)
    new_path = dirpath
 
change_directory(new_path)
