#!/bin/bash

banco="/mnt/c/Users/DIOGO GABRIEL/Projects/CURSO ADS/DESENVOLVIMENTO EM NUVEM/Avaliacao/backup_arquivos/bancos_de_dados/primeiro_banco.db"
diretorio_backup="/mnt/c/Users/DIOGO GABRIEL/Projects/CURSO ADS/DESENVOLVIMENTO EM NUVEM/Avaliacao/backup_arquivos/backups"

fazer_backup() {
    data_hora=$(date +"%Y-%m-%d_%H-%M-%S")
    nome_arquivo="backup_sqlite_$data_hora.sqlite"
    caminho_arquivo="$diretorio_backup/$nome_arquivo"

    cp "$banco" "$caminho_arquivo"

    echo "Um backup do banco de dados '$banco' foi criado em '$caminho_arquivo'!"
}

restaurar_backup() {
    backups=$(ls "$diretorio_backup" | grep -E '^backup_')
    if [ -z "$backups" ]; then
        echo "Nenhum backup foi encontrado encontrado!"
        exit 1
    fi

    ultimo_backup=$(echo "$backups" | sort -r | head -n 1)

    if [[ "$ultimo_backup" == backup_sqlite* ]]; then
        caminho_arquivo="$diretorio_backup/$ultimo_backup"
        cp "$caminho_arquivo" "$banco"
        echo "O último backup de '$caminho_arquivo' foi restaurado com sucesso!"
    fi
}

if [ "$1" == "backup" ]; then
    fazer_backup
elif [ "$1" == "restaurar" ]; then
    restaurar_backup
else
    echo "Uso: $0 [backup|restaurar]"
    exit 1
fi
