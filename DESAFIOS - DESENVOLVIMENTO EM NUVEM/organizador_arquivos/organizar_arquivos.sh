# !/bin/bash

# Caminho para a pasta de trabalho
pasta_de_trabalho="C:\Users\DIOGO GABRIEL\Projects\CURSO ADS\DESENVOLVIMENTO EM NUVEM\Teste"

# Lista de extenções
extensoes_imagens=("jpg" "jpeg" "png" "gif")
extensoes_documentos=("pdf" "doc" "docx" "txt")
extensoes_musicas=("mp3" "wav")
extensoes_videos=("mp4" "avi" "mkv")
extensoes_codigos=("c" "cpp" "py")

while true; do
    echo "Iniciando nova verificação. $(date -u '+%Y-%m-%d%H:%M:%S')"
done

for arquivo in "$pasta_de_trabalho"/*; do
    if [ -f "$arquivo" ]; then
        extensao_do_arquivo="${arquivo##*.}"
    fi
done

destino="$pasta_de_trabalho/Outros" # Pasta padrão

for extensao in "${extensoes_imagens[@]}"; do
    if [ "$extensao_do_arquivo" = "$extensao" ]; then
        destino="$pasta_de_trabalho/Imagens"
        break
    fi
done
# Adicione mais blocos 'for' para outras categorias


echo "Arquivo $arquivo será salvo em $destino"
[ -d "$destino" ] || mkdir -p "$destino"
mv "$arquivo" "$destino/"

sleep 3600
