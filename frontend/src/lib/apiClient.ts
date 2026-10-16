const API_URL = import.meta.env.VITE_API_URL;

export const get = (path: string) => {
  const fullPath = `${API_URL}${path}`;
  return fetch(fullPath, {
    headers: {
      "Accept": "application/json"
    }
  })
}

export const post = <T>(path: string, body: T) => {
  const fullPath = `${API_URL}${path}`;
  return fetch(fullPath, {
    method: "POST",
    headers: {
      "Accept": "application/json",
      "Content-Type": "application/json"
    },
    body: JSON.stringify(body)
  })
}
