#!/bin/bash

diretorio_backup="/mnt/c/Users/DIOGO GABRIEL/Projects/CURSO ADS/DESENVOLVIMENTO EM NUVEM/Avaliacao/backup_arquivos/backups"

backups=$(ls "$diretorio_backup" | grep -E '^backup_')
if [ -z "$backups" ]; then
    echo "Nenhum backup foi encontrado encontrado!"
    exit 1
fi

ultimo_backup=$(echo "$backups" | sort -r | head -n 1)

if [[ "$ultimo_backup" == backup_sqlite* ]]; then
    banco="/mnt/c/Users/DIOGO GABRIEL/Projects/CURSO ADS/DESENVOLVIMENTO EM NUVEM/Avaliacao/backup_arquivos/bancos_de_dados/primeiro_banco.db"
    caminho_arquivo="$diretorio_backup/$ultimo_backup"
    cp "$caminho_arquivo" "$banco"
    echo "O último backup de '$caminho_arquivo' foi restaurado com sucesso!"
fi
