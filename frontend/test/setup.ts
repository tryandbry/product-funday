import { JSDOM } from 'jsdom'

const { window } = new JSDOM('<!doctype html><html><body></body></html>', {
  url: 'http://localhost/',
})

Object.defineProperties(globalThis, {
  window: { configurable: true, value: window },
  document: { configurable: true, value: window.document },
  navigator: { configurable: true, value: window.navigator },
  HTMLElement: { configurable: true, value: window.HTMLElement },
  Node: { configurable: true, value: window.Node },
  getComputedStyle: { configurable: true, value: window.getComputedStyle },
})
