import os
import time
#-----------------------------Funções-----------------------------------
def cript(alfa, txt, key):
	conv = ''
	for c in txt:
		if c in alfa:
			indice = alfa.find(c)
			indice = indice+key
			if indice >= tam:
				indice = indice-tam
			conv = conv+alfa[indice]
		else:
			conv = conv+c
	return conv


def decript(alfa, txt, key):
	conv = ''
	for c in txt:
		if c in alfa:
			indice = alfa.find(c)
			indice = indice-key
			if indice < 0:
				indice = indice+tam
			conv = conv+alfa[indice]
		else:
			conv = conv+c
	return conv


def verificar(login, senha, alfabeto):
	arquivo = open("Users.txt", "r")
	txt = arquivo.read()
	arquivo.close()
	var = cript(alfabeto, login+senha, chavesenha(senha, alfabeto))
	if var in txt:
		return True
	else:
		return False


def chavesenha(senha, alfa):
	valor = 0
	for x in senha:
		a = alfa.index(x)
		valor = valor+a
		if valor > tam:
			valor = valor-95
	return valor
#----------------------------Código principal---------------------------
alfa = "a1b2c3d4e5f6g7h8i9j!k@l#m$n%o&p*q)r(s-t=u+v§x\w|y/z?A;B:C´D`F~G^H]I[J}K{L.M,N>O<P°QºRªS0TWZVXUY"
tam=len(alfa)
#---------------------------------Login---------------------------------
acesso = False
while acesso == False:
		login = input("Login: ")
		senha = input("Senha: ")
		key = chavesenha(senha, alfa)

		if login and senha  == "admin" or login and senha == "ADMIN":
				acesso = True
		elif verificar(login, senha, alfa):
			acesso = True
		else:
			acesso = False
		os.system("cls")
#--------------------------Tela de carregamento-------------------------
escolha = ()

while escolha != 0:
	os.system("cls")
	print("CARREGANDO SISTEMA...")
	time.sleep(1)
#----------------------------------Menu---------------------------------
	os.system("cls")
	print("1 - Registrar usuário\n2 - Guardar dados\n3 - Ler dados\n0 - Sair")
	escolha = int(input("Escolha sua opção: "))
#--------------------------------Escolhas-------------------------------
	if escolha == 1:
		sair = False
		while sair != True: #Cadastrar usuario
			os.system("cls")
			clogin = input("Digite um novo login:")
			csenha = input("Digite uma nova senha:")
			ckey = chavesenha(csenha,alfa)
			arquivo = open("Users.txt", "a")
			arquivo.write(cript(alfa,clogin+csenha,ckey)+"\n")
			arquivo.close()
			print("Usuario cadastrado")
			time.sleep(0.5)
			os.system("cls")
			esc = input("Deseja cadastrar outro Usuário?\n S ou N?: ")
			if esc == "N" or esc == "n":
				sair = True

	elif escolha == 2:  #Salvar Dados
		sair = False
		while sair != True:
			os.system("cls")
			txt = input("Digite o texto que deseja criptografar: ")
			arquivo = open("Dados.txt", "a")
			arquivo.write(cript(alfa,txt,key)+"\n")
			arquivo.close()
			print("Dados Salvos")
			time.sleep(1)
			os.system("cls")
			esc = input("Deseja regisgtrar mais informações?\n S ou N?: ")
			if esc == "n" or esc == "N":
				sair = True

	elif escolha == 3:  #Ler dados
		os.system("cls")
		arquivo = open("Dados.txt", "r")
		txt = arquivo.read()
		decriptado = decript(alfa,txt,key)
		arquivo.close()
		print("--------------------------------SEUS DADOS FORAM SALVOS-------------------------------")
		print(decriptado)
		print("Pressione ENTER para sair")
		input()

	elif escolha == 0:  #Sair
		os.system("cls")
		print("ENCERRANDO SISTEMA...")
		time.sleep(1)
		os.system("CLS")
		print("SISTEMA ENCERRADO...\n\nAPERTE ENTER PARA FECHAR")
		break

	else:
		os.system("cls")
		print("ESCOLHA NÃO DISPONÍVEL...")
		time.sleep(1.5)
