import{z as t,an as s,L as e,ak as i,h as r}from"./952f98a9.js";import"./7f3d7ca9.js";var a=t`:host {
  display: block;
  box-sizing: border-box; }

:host([hidden]), [hidden] {
  display: none !important; }

*, *:before, *:after {
  box-sizing: inherit; }
`;class l extends(s(e)){static get is(){return"bbva-aggregation-bullet-list"}static get properties(){return{items:{type:Array},role:{type:String}}}constructor(){super(),this.items=[],this.role="list"}static get styles(){return[a,i("bbva-aggregation-bullet-list-shared-styles")]}render(){return r`
      ${this.items.map((t=>r`
        <bbva-list-bullet role="listitem">${this.t(t)}</bbva-list-bullet>
      `))}`}}export{l as B};
