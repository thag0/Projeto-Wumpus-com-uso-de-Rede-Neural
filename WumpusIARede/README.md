# Treinamento do agente de aprendizagem com uso de redes neurais artificiais

Diretório destinado ao código fonte do algoritmo de treinamento para os agentes do mundo de wumpus

A implementação do agente de aprendizagem foi feita usando redes neurais artificiais, um algortimo se assemelha ao funcionamento do cérebro humano. Cada rede é composta por camadas 
e cada camada é composta por neurônios artificiais, o modelo de rede neural criado é baseado no processo de *feedforward*, então alimentamos a rede com os dados do ambiente que foram: 
posições norte, sul, leste e oeste disponíveis, sensações na casa atual tais como fedor, brisa e brilho, e alguns atributos do próprio agente que a rede controla como a informação se ele 
pegou o ouro, matou o wumpus e se ainda tem flecha.

- Criar vários agentes com redes neurais aleatórias
- Quando todos os agentes morrerem, calculamos o agente com maior pontuação
- Clonamos a rede neural do melhor agente para ela ser usada na próxima geração
- Os indivíduos da nova geração irão receber a rede neural do último melhor agente, mas com pequenas modificações aleatórias com o objetivo de gerar um agente ainda melhor
- Repetimos o processo até conseguir um agente que ganhe o jogo

![gifTreinamentoRedes](https://github.com/thag0/Projeto-Wumpus-Inteligencia-Computacional/assets/91092364/2d6cc61d-72aa-43d0-8642-588230ce6e2c)