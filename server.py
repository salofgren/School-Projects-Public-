#TCP Server script

import socket

mySocket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
mySocket.bind(('127.0.0.1', 43210))
mySocket.listen(1)

print('TCP Server Running')

while True:
    connectedsocket, connectedaddress = mySocket.accept()
    print('New connection from '+ str(connectedaddress))