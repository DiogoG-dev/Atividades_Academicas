#!/bin/bash

banco="/mnt/c/Users/DIOGO GABRIEL/Projects/CURSO ADS/DESENVOLVIMENTO EM NUVEM/Avaliacao/backup_arquivos/bancos_de_dados/primeiro_banco.db"
diretorio_backup="/mnt/c/Users/DIOGO GABRIEL/Projects/CURSO ADS/DESENVOLVIMENTO EM NUVEM/Avaliacao/backup_arquivos/backups"


data_hora=$(date +"%Y-%m-%d_%H-%M-%S")
nome_arquivo="backup_sqlite_$data_hora.sqlite"
caminho_arquivo="$diretorio_backup/$nome_arquivo"

cp "$banco" "$caminho_arquivo"

echo "Um backup do banco de dados '$banco' foi criado em '$caminho_arquivo'!"
