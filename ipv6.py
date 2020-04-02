import ipaddress

while True:
    compOrExplode = input("Do you have a Compressed(1) or Expanded(2) address? (-1 to end)")

    if (compOrExplode == "1"):
        userInput = input("Enter a compressed IPv6 address: ")
        addr = ipaddress.ip_address(userInput)
        print(addr.exploded)
    elif(compOrExplode == "2"):
        userInput = input("Enter an expanded IPv6 address: ")
        addr = ipaddress.IPv6Address(userInput)
        print(addr.compressed)
    elif(compOrExplode == "-1"):
        break